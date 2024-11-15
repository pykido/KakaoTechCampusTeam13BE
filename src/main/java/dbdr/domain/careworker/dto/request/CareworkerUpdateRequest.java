package dbdr.domain.careworker.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalTime;
import java.util.Set;
import java.time.DayOfWeek;

public record CareworkerUpdateRequest(
    @Schema(description = "요양보호사의 알림 시간", example = "17:00:00")
    LocalTime alertTime,

    @Schema(description = "근무 요일")
    Set<DayOfWeek> workingDays,

    @Schema(description = "SMS 수신 동의 여부", example = "true")
    boolean smsSubscription,

    @Schema(description = "LINE 수신 동의 여부", example = "true")
    boolean lineSubscription
) {
}
