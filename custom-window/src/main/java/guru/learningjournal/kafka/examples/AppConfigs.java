/*
 * Copyright (c) 2019. Prashant Kumar Pandey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package guru.learningjournal.kafka.examples;

/**
 * Application Config
 *
 * @author prashant
 * @author www.learningjournal.guru
 */

public class AppConfigs {
    final static String applicationID = "StockFeedApp";
    final static String bootstrapServers = "localhost:9092";
    final static String sourceTopicName = "stock-tick";
    final static String targetTopicName = "training-feed";
    final static String sourceName = "stock-tick-source";
    final static String sinkName = "training-feed-sink";
    final static String stateStoreLocation = "logs/state-store";
    public final static int ltpStackSize = 10;
    public final static long secondsDelay = 10;

}
