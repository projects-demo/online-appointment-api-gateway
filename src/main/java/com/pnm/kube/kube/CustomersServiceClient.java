package com.pnm.kube.kube;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Component
@RequiredArgsConstructor
public class CustomersServiceClient {

	private final WebClient.Builder webClientBuilder;
	private String hostname = "http://patient-service";
	private String portName = "8080";

	public Mono<OwnerDetails> getOwner(final int ownerId) {
		System.err.println("");

		return webClientBuilder.build().get().uri(hostname + ":" + portName + "/owners/{ownerId}", ownerId).retrieve()
				.bodyToMono(OwnerDetails.class);
	}
}
