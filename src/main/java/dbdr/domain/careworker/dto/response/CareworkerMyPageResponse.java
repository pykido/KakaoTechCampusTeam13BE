package dbdr.domain.careworker.dto.response;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CareworkerMyPageResponse {

    private String name;
    private String phone;
    private String institutionName;
    private Set<DayOfWeek> workingDays;
    private LocalTime alertTime;
}