import com.Application;
import com.common.dao.Cluster;
import com.common.dao.IClusterDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by lzz on 2018/9/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ClusterDaoTest {
    @Autowired
    private IClusterDao clusterDao;

    @Test
    public void getClusterListTest(){
        List<Cluster> clusterList = clusterDao.getClusterList("jjqnr");
        System.out.println( clusterList );
    }
}
