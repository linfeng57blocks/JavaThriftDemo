package service.demo;

import org.apache.thrift.TException;

public class HelloServiceImpl implements Hello.Iface {

    public String helloString(String para) throws TException {
        return "result:" + para;
    }
}
