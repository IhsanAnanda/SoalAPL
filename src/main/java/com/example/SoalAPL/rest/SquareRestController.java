package com.example.SoalAPL.rest;

import com.example.SoalAPL.dto.SquareReqDto;
import com.example.SoalAPL.service.SquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SquareRestController {
    @Autowired
    SquareService squareService;

    @PostMapping("/api/square")
    public ResponseEntity<Object> getSquare(@RequestBody SquareReqDto req){
        try{
            var res = squareService.getResult(req.getN());
            return ResponseEntity.status(HttpStatus.OK).body(res);
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Runtime error on the server");
        }
    }

}
