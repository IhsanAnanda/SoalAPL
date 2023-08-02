package com.example.SoalAPL;

import com.example.SoalAPL.dto.SquareReqDto;
import com.example.SoalAPL.dto.SquareResDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SoalAplApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void testSquare5() throws Exception {
		SquareReqDto req = new SquareReqDto(5);
		mockMvc.perform(
				post("/api/square")
						.accept(MediaType.APPLICATION_JSON)
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(req))
		).andExpectAll(
				status().isOk()
		).andDo(result -> {
			SquareResDto response = objectMapper.readValue(result.getResponse().getContentAsString(), new TypeReference<>() {
			});
			assertEquals("=====|   ||   ||   |=====", response.getSquare());
		});
	}

	@Test
	void testSquare2() throws Exception {
		SquareReqDto req = new SquareReqDto(2);
		mockMvc.perform(
				post("/api/square")
						.accept(MediaType.APPLICATION_JSON)
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(req))
		).andExpectAll(
				status().isOk()
		).andDo(result -> {
			SquareResDto response = objectMapper.readValue(result.getResponse().getContentAsString(), new TypeReference<>() {
			});
			assertEquals("Nilai terlalu kecil", response.getSquare());
		});
	}

	@Test
	void testSquare10() throws Exception {
		SquareReqDto req = new SquareReqDto(10);
		mockMvc.perform(
				post("/api/square")
						.accept(MediaType.APPLICATION_JSON)
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(req))
		).andExpectAll(
				status().isOk()
		).andDo(result -> {
			SquareResDto response = objectMapper.readValue(result.getResponse().getContentAsString(), new TypeReference<>() {
			});
			assertEquals("Nilai terlalu besar", response.getSquare());
		});
	}

}
