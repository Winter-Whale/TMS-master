package TMS8.zadacha1;


class Terapevt extends Doctor {
    String name = "Терапевт";

    void setDoctor(Patient p) {
        Doctor doctor;
        switch (p.getTreatmentPlan()) {
            case 1:
                doctor = new Hirurg();
                break;
            case 2:
                doctor = new Dantist();
                break;
            default:
                doctor = this;
        }
        p.setDoctor(doctor);
    }

    @Override
    String treatment() {
        return "Проведет осмотр, выпишет лекарства, запишет на прием";
    }
}