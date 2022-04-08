package zhao.lhcmo.controller;

import org.springframework.web.bind.annotation.*;
import zhao.lhcmo.pojo.Goods;
import zhao.lhcmo.service.IGoodsService;
import zhao.lhcmo.util.Ret;

import javax.annotation.Resource;
//rest风格
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private IGoodsService goodsService;

    @GetMapping
    public Ret getAll(){
        return new Ret(goodsService.list());
    }

    @PostMapping
    public Ret save(@RequestBody Goods goods) {
        System.out.println(goods.getGoodsid());
        return new Ret(goodsService.save(goods));
    }

    @PutMapping
    public Ret modify(@RequestBody Goods goods) {

        return new Ret(goodsService.saveOrUpdate(goods));
    }

    @DeleteMapping("{id}")
    public Ret delete( @PathVariable Integer id) {
        return new Ret(goodsService.removeById(id));
    }

    @GetMapping("{id}")
    public Ret getById( @PathVariable Integer id) {
        return new Ret(goodsService.getById(id));
    }
}
