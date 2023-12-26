package techmaster.entities;

import java.time.LocalDate;

    public class OpenningScheduel {
    private int id;
    private static int autoId;
    private LocalDate start_date;
    private String address;
    private String study_day;
    private String study_time;

        public OpenningScheduel(LocalDate start_date, String address, String study_day, String study_time) {
            this.id = ++autoId;
            this.start_date = start_date;
            this.address = address;
            this.study_day = study_day;
            this.study_time = study_time;
        }

        public int getId() {
            return id;
        }

        public LocalDate getStart_date() {
            return start_date;
        }

        public String getAddress() {
            return address;
        }

        public String getStudy_day() {
            return study_day;
        }

        public String getStudy_time() {
            return study_time;
        }
    }
