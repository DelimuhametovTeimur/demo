package md.testapp.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class UserAccess {

    @NotBlank
    private String username;

    @NotBlank
    private boolean YoutubeAccess;

    @NotBlank
    private boolean InstagramAccess;

    @NotBlank
    private boolean VkAccess;

    @NotBlank
    private boolean FacebookAccess;




}
