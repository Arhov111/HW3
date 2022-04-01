import com.TestingHW3.GymMembership;
import com.TestingHW3.Member;
import org.testng.annotations.*;
import org.testng.Assert;
import org.junit.Test;


public class GymMembershipTest {

    @Test
    public void addMemberTest(){
        Assert.assertNotNull(new GymMembership().addMember(new Member("Araks", "Hovhannisyan", 11, 40)));
    }

    @Test
    public void removeMemberTest(){
        Assert.assertNotNull(new GymMembership().removeMember(new Member("Araks", "Hovhannisyan", 11, 40)));
    }

    @Test
    public void numberOfMembersTest(){
        Assert.assertNotNull(new GymMembership().numberOfMembers());
    }

    @Test
    public void isEligibleForExtension(){
        Assert.assertNotNull(new GymMembership().isEligibleForExtension(new Member("Araks", "Hovhannisyan", 11, 40)));
    }
}
