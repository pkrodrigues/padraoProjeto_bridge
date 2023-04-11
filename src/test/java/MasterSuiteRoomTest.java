import org.junit.jupiter.api.Test;
import structuralpatterns.bridge.classes.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MasterSuiteRoomTest {
    @Test
    void deveRetornarDiariaMasterSuiteRoomParaClienteBasico() {
        Customer customer = new CustomerBasic();
        MasterSuiteRoom masterSuiteRoom = new MasterSuiteRoom(203, 300.0f);
        masterSuiteRoom.setCustomertype(customer);
        masterSuiteRoom.setServiceFees(150.0f);
        assertEquals(450.0f, masterSuiteRoom.calculateDailyPrice(), 0.0f);

    }

    @Test
    void deveRetornarDiariaMasterSuiteRoomParaClienteVip() {
        Customer customer = new CustomerVip();
        MasterSuiteRoom masterSuiteRoom = new MasterSuiteRoom(203, 300.0f);
        masterSuiteRoom.setCustomertype(customer);
        masterSuiteRoom.setServiceFees(150.0f);
        assertEquals(420.0f, masterSuiteRoom.calculateDailyPrice(), 0.1f);

    }

    @Test
    void deveRetornarDiariaMasterSuiteRoomParaClienteGold() {
        Customer customer = new CustomerGold();
        MasterSuiteRoom masterSuiteRoom = new MasterSuiteRoom(203, 300.0f);
        masterSuiteRoom.setCustomertype(customer);
        masterSuiteRoom.setServiceFees(150.0f);
        assertEquals(360.0f, masterSuiteRoom.calculateDailyPrice(), 0.3f);

    }
}
