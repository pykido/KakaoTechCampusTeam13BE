package dbdr.security.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * DbdrAuth 도메인 관련 권한 확인 어노테이션 <br>
 * <br>
 * targetRole : 누가 접근할 수 있는가 -> 어드민을 위한 것이다 or 요양보호사를 위한 것이다<br>
 * authParam : 해당 메소드 파라미터 타입 ex) 요양원ID, 요양사ID, 환자ID, 차트ID 등<br>
 * id : 전달하고자하는 실제 값의 메소드 파라미터명<br>
 * <br>
 *
 * @see dbdr.security.service.DbdrSeucrityService
 * @see AuthParam
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DbdrAuth {
    Role targetRole();
    AuthParam authParam() default AuthParam.NONE;
    String id() default "";
}


