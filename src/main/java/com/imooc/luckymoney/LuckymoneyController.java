package com.imooc.luckymoney;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class LuckymoneyController {
   @Autowired
   private LuckymoneyRepository repository;
   @Autowired
   private LuckymoneyService service;

   @GetMapping("/luckymoneys")
    public List<Luckymoney>  list(){
        return  repository.findAll();
    }

    @PostMapping("/createmoneys")
    public  Luckymoney create(@RequestParam("producer") String producer,@RequestParam("money") BigDecimal money){
       Luckymoney luckymoney =new Luckymoney();
       luckymoney.setProducer(producer);
       luckymoney.setMoney(money);
       return repository.save(luckymoney);
    }
    @GetMapping("/luckymoneys/{id}")
    public Luckymoney findById(@PathVariable("id") Integer id){
         return repository.findById(id).orElse(null);
    }

    @PutMapping("/luckymoneys/{id}")
    public Luckymoney updateById(@PathVariable("id") Integer id,@RequestParam("consumer") String consumer){
        Optional<Luckymoney> optional =repository.findById(id);
if(optional.isPresent()){
    Luckymoney luckymoney =optional.get();
    luckymoney.setId(id);
    luckymoney.setConsumer(consumer);
    return repository.save(luckymoney);
  }

return null;
    }

    @PostMapping ("/lucky")
    public void createTwo(){
      service.createTwo();
    }


}
