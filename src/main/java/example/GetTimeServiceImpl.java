package example;

import com.grpc.examples.GetTimeServiceGrpc;
import com.grpc.examples.GetTimeServiceOuterClass;
import io.grpc.stub.StreamObserver;
import java.util.Date;

public class GetTimeServiceImpl extends GetTimeServiceGrpc.GetTimeServiceImplBase {

    @Override
    public void getTime(GetTimeServiceOuterClass.GetTimeRequest request, StreamObserver<GetTimeServiceOuterClass.GetTimeResponse> responseObserver) {

        System.out.println("Handling request: " + request.toString());
        System.out.println("action : " + request.getAction());

        GetTimeServiceOuterClass.GetTimeResponse response =
                GetTimeServiceOuterClass.GetTimeResponse.newBuilder()
                        .setTime(new Date().toString()).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
