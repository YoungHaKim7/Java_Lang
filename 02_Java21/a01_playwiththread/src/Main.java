import org.paumard.loom.thread.model.Contract;
import org.paumard.loom.thread.model.ContractService;
import org.paumard.loom.thread.model.Json;

public class Main {
    public static void main(String[] args) {
        long id = 12;
        Json request        = ContractService.build.ContractRequest(id); // 100ns
        String contractJson = ContractService.fetchContract(request);   // 100ms
        Contract contract   = Json.unmarshall(contractJson);            // 100ns
    }
}
