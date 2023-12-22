package techmaster.entities;

import java.time.LocalDate;

    public class OpenningScheduel {
    private int id;
    private LocalDate start_date;
    private String address;
    private String study_day;
    private String study_time;

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
