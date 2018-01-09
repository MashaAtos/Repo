import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDropTest extends BaseTest {
    private DragDropTest dragDropTest;

    @BeforeMethod
    public void setUp(){
        dragDropTest = new DragDropTest();
    }

    @Test
    public void DragDrop(){
       dragDropTest.DragAndDrop();
    }


}
