package md.testapp.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

import static lombok.AccessLevel.PRIVATE;

@Data
@NoArgsConstructor(access = PRIVATE, force = true)
@AllArgsConstructor
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "youtube")
    @Enumerated(EnumType.STRING)
    private AccesService youtube;

    @Column(name = "instagram")
    @Enumerated(EnumType.STRING)
    private AccesService instagram;

    @Column(name = "vk")
    @Enumerated(EnumType.STRING)
    private AccesService vk;

    @Column(name = "facebook")
    @Enumerated(EnumType.STRING)
    private AccesService facebook;


    public User(String username, String password) {
        this(username, password, Role.ROLE_USER, AccesService.Denied, AccesService.Denied,
                AccesService.Denied, AccesService.Denied);
    }

    public User(String username, String password, Role role, AccesService youtube,
                AccesService instagram, AccesService vk, AccesService facebook) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.youtube = youtube;
        this.instagram = instagram;
        this.vk = vk;
        this.facebook = facebook;
    }

    public static enum Role implements GrantedAuthority {

        ROLE_ADMINISTRATOR, ROLE_USER;

        @Override
        public String getAuthority() {

            return this.name();
        }
    }

    public static enum AccesService implements GrantedAuthority{

        Permited, Denied;

        @Override
        public String getAuthority() {

            return this.name();
        }

    }

}
