package donate.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    private Long foodId;
    private String name;
    private String type;
    private String description;
    private String location;
    private Long userId;
}
