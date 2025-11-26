package admin.admin;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminDTO {
    private String admin_id;
    private String password;
    private String role;
}
