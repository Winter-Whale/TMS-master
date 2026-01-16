package TMS8.zadacha1;


class Terapevt extends Doctor {
    String name = "Терапевт";

    @Override
    String treatment() {
        return "Проведет осмотр, выпишет лекарства, запишет на прием";
    }
}