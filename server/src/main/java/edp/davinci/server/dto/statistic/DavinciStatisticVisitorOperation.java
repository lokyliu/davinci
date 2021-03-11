package edp.davinci.server.dto.statistic;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import edp.davinci.server.commons.Constants;
import lombok.Data;

@Data
@NotNull(message = "Visitor operation info cannot be null")
public class DavinciStatisticVisitorOperation {

    @NotNull
    @Min(value = 1L)
    private Long user_id;

    @NotBlank
    @Pattern(regexp = Constants.REG_EMAIL_FORMAT, message = "Illegal email format")
    private String email;

    @NotBlank
    private String action;

    @Min(value = 1L)
    private Long org_id;

    @Min(value = 1L)
    private Long project_id;

    private String project_name;

    private String viz_type;

    @Min(value = 1L)
    private Long viz_id;

    private String viz_name;

    @Min(value = 1L)
    private Long sub_viz_id;

    private String sub_viz_name;

    @Min(value = 1L)
    private Long widget_id;

    private String widget_name;

    private List<Object> variables;

    private List<Object> filters;

    private List<Object> groups;

    @NotNull
    private Date create_time;

}
