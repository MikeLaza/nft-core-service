package io.store.core_service.nft;

import io.store.common.dto.NftResponse;
import io.store.common.dto.queue.GetNftMessage;
import io.store.common.service.rabbit_mq.RabbitMQService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Author: michelangelaz
 * Date: 1/6/22
 * Time: 9:05 AM
 * e-mail: mike.lazarenko.97@gmail.com
 */
@Service
@RequiredArgsConstructor
public class NftStoreService {

    private final RabbitMQService rabbitMQService;

    public NftResponse getNftByToken(final String token) {
        return rabbitMQService.exchange(GetNftMessage.of(token));
    }
}
