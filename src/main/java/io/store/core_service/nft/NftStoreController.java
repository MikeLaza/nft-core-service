package io.store.core_service.nft;

import io.store.common.dto.NftResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

/**
 * Author: michelangelaz
 * Date: 1/6/22
 * Time: 8:56 AM
 * e-mail: mike.lazarenko.97@gmail.com
 */
@RestController
@RequestMapping("/nft-store")
@RequiredArgsConstructor
public class NftStoreController {
    public final NftStoreService nftStoreService;

    @GetMapping("/{token}")
    public ResponseEntity<NftResponse> getNft(@PathVariable final String token) {
        return ResponseEntity.ok(nftStoreService.getNftByToken(token));
    }

}
