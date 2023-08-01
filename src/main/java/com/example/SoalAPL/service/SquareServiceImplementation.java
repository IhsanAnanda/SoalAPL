package com.example.SoalAPL.service;

import com.example.SoalAPL.dto.SquareResDto;
import org.springframework.stereotype.Service;

@Service
public class SquareServiceImplementation implements SquareService{
    @Override
    public SquareResDto getResult(int num) {
        if(num < 3){
            return new SquareResDto("Nilai terlalu kecil");
        }
        else if(num > 9){
            return new SquareResDto("Nilai telalu besar");
        }
        StringBuilder top = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        for(int i = 0; i < num; i++) {
            top.append("=");
        }
        for(int i = 0; i < num-2; i++){
            mid.append("| |");
        }
        return new SquareResDto(top.toString() + mid.toString() + top.toString());
    }
}
