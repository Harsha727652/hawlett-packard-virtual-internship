package in.harsha.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
private int employye_id;
private String first_name;
private String last_name;
private String email;
private String title;

}
