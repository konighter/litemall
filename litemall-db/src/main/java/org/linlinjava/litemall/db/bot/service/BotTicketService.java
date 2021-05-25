package org.linlinjava.litemall.db.bot.service;

import org.linlinjava.litemall.db.bot.domain.BotTicket;
import org.linlinjava.litemall.db.bot.vo.BotTicketCharge;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BotTicketService {


    public BotTicket getBotTicket(Long ticketId, String token) {
        return null;
    }

    /**
     * 获取客户下所有可使用的ticket, 包括已绑定状态的。
     * @param customerId
     * @return
     */
    public List<BotTicket> getIdleBotTicket(Long customerId) {
        return null;
    }

    /**
     * 创建chargeLog, 返回充值信息
     * @return
     */
    public BotTicketCharge.BotTicketPayInfo rechargeBotTicket(BotTicketCharge botTicketCharge) {
        return null;
    }

    public int doChargeBotTicket(Long ticketId, String chargeOrderId) {
        return 0;
    }

    /**
     * 创建一个botTicket
     * @param ticket
     * @return
     */
    public BotTicket createBotTicket(BotTicket ticket) {
        return null;
    }

    /**
     * 设置ticket绑定状态,不关心哪个bot绑定的
     * @param ticketId
     * @return
     */
    public int bindTicket(Long ticketId) {
        return 0;
    }

}
