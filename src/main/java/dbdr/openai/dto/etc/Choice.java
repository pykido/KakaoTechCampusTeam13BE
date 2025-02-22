package dbdr.openai.dto.etc;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(SnakeCaseStrategy.class)
public record Choice(
    int index,
    Message message,
    Object logprobs,
    String finishReason
) {}
