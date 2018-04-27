package com.baidu.ocr.demo;

import java.util.List;

public class PlateInfo {
    /**
     * log_id : 5932496654773650177
     * words_result : {"color":"blue","number":"鄂Q0M011","probability":[0.9999967813491821,1,0.9366337656974792,1,0.9999974966049194,0.9999939203262329,0.9999945163726807],"vertexes_location":[{"y":378,"x":166},{"y":377,"x":330},{"y":423,"x":330},{"y":424,"x":167}]}
     */

    private long log_id;
    private WordsResultBean words_result;

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public WordsResultBean getWords_result() {
        return words_result;
    }

    public void setWords_result(WordsResultBean words_result) {
        this.words_result = words_result;
    }

    public static class WordsResultBean {
        /**
         * color : blue
         * number : 鄂Q0M011
         * probability : [0.9999967813491821,1,0.9366337656974792,1,0.9999974966049194,0.9999939203262329,0.9999945163726807]
         * vertexes_location : [{"y":378,"x":166},{"y":377,"x":330},{"y":423,"x":330},{"y":424,"x":167}]
         */

        private String color;
        private String number;
        private List<Double> probability;
        private List<VertexesLocationBean> vertexes_location;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public List<Double> getProbability() {
            return probability;
        }

        public void setProbability(List<Double> probability) {
            this.probability = probability;
        }

        public List<VertexesLocationBean> getVertexes_location() {
            return vertexes_location;
        }

        public void setVertexes_location(List<VertexesLocationBean> vertexes_location) {
            this.vertexes_location = vertexes_location;
        }

        public static class VertexesLocationBean {
            /**
             * y : 378
             * x : 166
             */

            private int y;
            private int x;

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }
        }
    }
}
