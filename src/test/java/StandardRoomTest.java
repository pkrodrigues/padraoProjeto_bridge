import org.junit.jupiter.api.Test;
import structuralpatterns.bridge.classes.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardRoomTest {

    @Test
    void deveRetornarDiariaStandardParaClienteBasico() {
        Customer customer = new CustomerBasic();
        StandardRoom standardRoom = new StandardRoom(202, 120.0f);
        standardRoom.setCustomertype(customer);
        assertEquals(120.0f, standardRoom.calculateDailyPrice(), 0.0f);

    }

    @Test
    void deveRetornarDiariaStandardParaClienteVip() {
        Customer customer = new CustomerVip();
        SuiteRoom suiteRoom = new SuiteRoom(202, 120.0f);
        suiteRoom.setCustomertype(customer);
        assertEquals(108.0f, suiteRoom.calculateDailyPrice(), 0.1f);

    }

    @Test
    void deveRetornarDiariaStandardParaClienteGold() {
        Customer customer = new CustomerGold();
        SuiteRoom suiteRoom = new SuiteRoom(202, 120.0f);
        suiteRoom.setCustomertype(customer);
        assertEquals(84.0f, suiteRoom.calculateDailyPrice(), 0.3f);

    }


}
