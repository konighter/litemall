package org.linlinjava.litemall.promo.server;

import com.hanzhan.promotion.grpc.HelloReply;
import com.hanzhan.promotion.grpc.HelloRequest;
import com.hanzhan.promotion.grpc.MyServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MyServiceServer extends MyServiceGrpc.MyServiceImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply replay =  HelloReply.newBuilder().setMessage(request.getName() + " Hello").build();
        responseObserver.onNext(replay);
        responseObserver.onCompleted();
    }
}
