package dbdr.domain.excel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExcelGuardianResponse {

    private Long id;
    private String name;
    private String phone;
    private Long institution;

}