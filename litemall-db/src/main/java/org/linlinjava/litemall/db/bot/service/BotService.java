package org.linlinjava.litemall.db.bot.service;

import org.linlinjava.litemall.db.bot.dao.BotDetailMapper;
import org.linlinjava.litemall.db.bot.domain.BotDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotService {

    @Autowired
    private BotDetailMapper botDetailMapper;

    public BotDetail createBot(Long staffId) {
        return null;
    }
    public List<BotDetail> getAllBots(Long staffId, Integer status) {
        return null;
    }




}
