import io.javalin.Javalin;

import java.util.Objects;

public class Main {

    static final FactsDao factsDao = new FactsDao();
    public static void main(String[] args) {
        Javalin app = Javalin.create()
                .start(getHerokuAssignedPort())
                .get("/random", ctx -> ctx.json(Objects.requireNonNull(factsDao.random())));
    }

    private static int getHerokuAssignedPort() {
        String herokuPort = System.getenv("PORT");
        if (herokuPort != null) {
            return Integer.parseInt(herokuPort);
        }
        return 7000;
    }

}