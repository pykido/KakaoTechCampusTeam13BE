package dbdr.domain.chart;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PhysicalClear {
    @Comment("세면 유무")
    private boolean wash;

    @Comment("목욕 유무")
    private boolean bath;
}