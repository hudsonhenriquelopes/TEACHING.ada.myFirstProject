package br.gov.caixa.exemplo.solid;

public class BancoService {
    static void connectDefault(BancoConnection banco) {
        banco.config("port:8084");
        banco.connect();
    }
}

class BancoApplication {
    public static void main(String[] args) {
        BancoService.connectDefault(new BancoOracle());
    }
}

interface BancoConnection {
    void config(String... params);
    void connect();
}

class BancoMySql implements BancoConnection {

    @Override
    public void config(String... params) {

    }

    @Override
    public void connect() {

    }
}

class BancoOracle implements BancoConnection {
    @Override
    public void config(String... params) {

    }

    @Override
    public void connect() {

    }
}
