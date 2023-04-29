package com.pnm.kube.kube;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

import static java.util.stream.Collectors.joining;


@Component
@RequiredArgsConstructor
public class VisitsServiceClient {

	// Could be changed for testing purpose
	private String hostname = "http://visits-service";
	private String portName = "9999";
	private final WebClient.Builder webClientBuilder;

	public Mono<Visits> getVisitsForPets(final List<Integer> petIds) {
		return webClientBuilder.build().get()
				.uri(hostname + ":" + portName + "/"+ "pets/visits?petId={petId}", joinIds(petIds)).retrieve()
				.bodyToMono(Visits.class);
	}

	private String joinIds(List<Integer> petIds) {
		return petIds.stream().map(Object::toString).collect(joining(","));
	}

	void setHostname(String hostname) {
		this.hostname = hostname;
	}
}
