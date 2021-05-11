package org.linlinjava.litemall.admin.web;

import com.hanzhan.promotion.grpc.HelloRequest;
import com.hanzhan.promotion.grpc.MyServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GrpcClient("hello-service")
    private MyServiceGrpc.MyServiceBlockingStub client;

    @RequestMapping("/")
    public String index() {
        return client.sayHello(HelloRequest.newBuilder().setName("hello Newer").build()).getMessage();
    }

}
