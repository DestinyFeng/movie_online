package com.woniu.serviceimpl;

import com.woniu.entity.CinemaRoom;
import com.woniu.mapper.CinemaRoomMapper;
import com.woniu.service.CinemaRoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CinemaRoomServiceImpl implements CinemaRoomService {
    @Resource
    private CinemaRoomMapper cinemaRoomMapper;
    @Override
    public void insertRoom(CinemaRoom cinemaRoom) throws Exception {
        cinemaRoomMapper.insert(cinemaRoom);
    }

    @Override
    public List<CinemaRoom> selectAllByCid(Integer cid,Integer start,Integer num) throws Exception {
        return cinemaRoomMapper.selectAllByCid(cid,start,num);
    }

    @Override
    public void updateById(CinemaRoom cinemaRoom) {
        cinemaRoomMapper.updateByPrimaryKey(cinemaRoom);
    }

    @Override
    public Integer selectCountByCid(Integer cid) {
        return cinemaRoomMapper.selectCountByCid(cid);
    }
}
