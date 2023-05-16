package last_test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;

import oracle.sql.DATE;

public class TestMain {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		UserDTO dto = new UserDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("DB연결확인 - " + dao.conn());
		System.out.println("=================================");
		System.out.println("           팀플 프로젝트");
		System.out.println("         (게시판 만들기)");
		System.out.println("=================================");
//		dao.selectList();
		while (true) {
			System.out.println("[1]게시판  [2]날씨 [0]종료");
			int function = dao.intInput();
			if (function == 1) {
				System.out.println("[회원이시면 로그인, 아니시면 회원가입을 해주세요.]");
				while (true) {
					System.out.println("[1]로그인  [2]회원가입 [0]이전으로");
					int sign = dao.intInput();
					if (sign == 1) {
						if (dao.signIn(dto) == true) {
							if (dto.getMember_id().equals("admin")) {
								System.out.println(dto.getMember_id() + "(관리자)님 로그인되었습니다.");
								while (true) {
									System.out.println("[1]회원조회 [2]회원탈퇴 [3]게시글 작성 [4]게시글 삭제 [5]로그아웃");
									int admin = dao.intInput();
									if (admin == 1) {
										dao.selectList();
									} else if (admin == 5) {
										System.out.println(dto.getMember_id() + "(관리자)님 로그아웃됩니다.");
										break;
									}
								}
							} else {
								System.out.println(dto.getMember_id() + "님 로그인되었습니다.");
								while (true) {
									System.out.println("[1]회원수정 [2]회원탈퇴 [3]게시글 작성 [4]게시글 삭제 [5]로그아웃");
									int user = dao.intInput();
									if (user == 1) {
										dao.update(dto);
									} else if (user == 2) {
										dao.delete(dto);
										if(dto.getMember_id().equals("")) {
											break;											
										}else {
											continue;
										}
									} else if (user == 3) {
										BoardDTO bdto = new BoardDTO();
										dao.boardAdd(bdto , dto.getMember_id());
									} else if (user == 4) {

									} else if (user == 5) {
										System.out.println(dto.getMember_id() + "님 로그아웃됩니다.");
										break;
									}
								}

							}
						}

					} else if (sign == 2) {
						dao.signUp();
					} else if (sign == 0) {
						break;
					} else {
						System.out.println("잘못된 입력입니다.");
					}

				}
			} else if (function == 2) {
				dao.weather();
			} else if (function == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}
	}
}
