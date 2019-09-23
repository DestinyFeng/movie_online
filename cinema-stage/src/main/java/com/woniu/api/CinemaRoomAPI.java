package com.woniu.api;

import com.woniu.entity.CinemaRoom;
import com.woniu.service.CinemaRoomService;
import com.woniu.util.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/room")
public class CinemaRoomAPI {

    @Resource
    private CinemaRoomService cinemaRoomService;
    @PostMapping
    public Result insertRoom(CinemaRoom cinemaRoom) throws Exception{
        System.out.println(cinemaRoom);
        cinemaRoomService.insertRoom(cinemaRoom);
        return new Result("success","添加影厅成功",null,null);
    }

}