import org.junit.jupiter.api.Test;
import structuralpatterns.bridge.classes.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuiteRoomTest {
    @Test
    void deveRetornarDiariaSuiteParaClienteBasico(){
        Customer customer = new CustomerBasic();
        SuiteRoom suiteRoom =  new SuiteRoom(202, 180.0f);
        suiteRoom.setCustomertype(customer);
        assertEquals(180.0f, suiteRoom.calculateDailyPrice(), 0.0f);

    }

    @Test
    void deveRetornarDiariaSuiteParaClienteVip(){
        Customer customer = new CustomerVip();
        SuiteRoom suiteRoom =  new SuiteRoom(202, 180.0f);
        suiteRoom.setCustomertype(customer);
        assertEquals(162.0f, suiteRoom.calculateDailyPrice(), 0.1f);

    }

    @Test
    void deveRetornarDiariaSuiteParaClienteGold(){
        Customer customer = new CustomerGold();
        SuiteRoom suiteRoom =  new SuiteRoom(202, 180.0f);
        suiteRoom.setCustomertype(customer);
        assertEquals(126.0f, suiteRoom.calculateDailyPrice(), 0.3f);

    }
}
