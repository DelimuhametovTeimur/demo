package md.testapp.demo.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserAccess {


    private String username;

    private String youtubeAccess;

    private String instagramAccess;

    private String vkAccess;

    private String facebookAccess;

    public UserAccess (String username, String youtubeAccess, String instagramAccess, String vkAccess, String facebookAccess)
    {
        this.username = username;
        this.youtubeAccess = (youtubeAccess.isEmpty()) ? "Denied" : "Permitted";
        this.instagramAccess = (instagramAccess.isEmpty()) ? "Denied" : "Permitted";
        this.vkAccess = (vkAccess.isEmpty()) ? "Denied" : "Permitted";
        this.facebookAccess = (facebookAccess.isEmpty()) ? "Denied" : "Permitted";
    }


}
