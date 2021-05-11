package org.linlinjava.litemall.admin.server;

import com.hanzhan.promotion.grpc.BotServiceGrpc;
import com.hanzhan.promotion.grpc.PromServ;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BotServiceServer extends BotServiceGrpc.BotServiceImplBase {


    @Override
    public void createBot(PromServ.BotOptRequest request, StreamObserver<PromServ.BotOptResponse> responseObserver) {
    }
}
