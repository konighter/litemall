package org.linlinjava.litemall.db.bot.vo;


import lombok.Data;

@Data
public class BotTicketCharge {
    private Long ticketId;
    private Integer chargeNum;
    private String unit;

    @Data
    public static class BotTicketPayInfo {
        private Long ticketId;
        private String ticketChargeOrderId;
    }
}
