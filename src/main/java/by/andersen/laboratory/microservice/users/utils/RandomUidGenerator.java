package by.andersen.laboratory.microservice.users.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RandomUidGenerator {

    public Long generateRandomTransferUid() {
        return UUID.randomUUID().getMostSignificantBits() >>> 16;
    }


}
