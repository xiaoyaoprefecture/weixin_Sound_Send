package bean;

/**
 * Created by Administrator on 2017/5/5.
 */

public class Recorder {

        float time;
        String filepath;

        public Recorder(float time, String filepath) {
            this.time = time;
            this.filepath = filepath;
        }

        public float getTime() {
            return time;
        }

        public void setTime(float time) {
            this.time = time;
        }

        public String getFilepath() {
            return filepath;
        }

        public void setFilepath(String filepath) {
            this.filepath = filepath;
        }

}
