package Code;

/**
 * Created by DanteDC on 11/11/2015.
 */
public class Profile {
    private String name;
    private String avatar;
    private String email;

    public Profile(String name, String avatar, String email)
    {
        this.name = name;
        this.avatar = avatar;
        this.email = email;
    }

    public Profile(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getAvatar()
    {
        return avatar;
    }
}
