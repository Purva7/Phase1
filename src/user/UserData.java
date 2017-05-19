/**
 * 
 */
package user;

import java.io.Serializable;

/**
 * @author Purva
 *
 */
public class UserData implements Serializable {

	String username;
    String email;
    int age;

    public UserData()
    {
    	
    }
    public void setUsername( String value )
    {
        username = value;
    }

    public void setEmail( String value )
    {
        email = value;
    }

    public void setAge( int value )
    {
        age = value;
    }

    public String getUsername() { return username; }

    public String getEmail() { return email; }

    public int getAge() { return age; }

}
