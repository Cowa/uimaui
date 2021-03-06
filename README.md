# uimaui

*Put some Maui in your UIMA pipelines, if you are crazy enough*

## Usage

Before extracting topics, you have to build a model.
Here the model, aka `MauiFilter` is a UIMA resource.
Bind it to an `MauiTopicExtractorAnnotator` analysis engine description and set the parameters for the model.  
It is fully parameterizable as expected with Maui.

Then create your Analysis engine from its description and set its parameters.

And of course, extracted topics are added to the `CAS`.

**TL;DR: show me the code**

```java
AnalysisEngineDescription aed = createEngineDescription(MauiTopicExtractorAnnotator.class);

createDependencyAndBind(aed, MauiModelResource.PARAM_MODEL(), MauiModelResource.class, "",
  // Parameters
  MauiModelResource.PARAM_TRAIN_DIR(), "src/main/resources/data/term_assignment/train_fr",
  MauiModelResource.PARAM_VOCABULARY(), "src/main/resources/data/vocabularies/agrovoc_fr.rdf.gz",
  MauiModelResource.PARAM_FORMAT(), "skos",
  MauiModelResource.PARAM_LANGUAGE(), "fr",
  MauiModelResource.PARAM_ENCODING(), "UTF-8"
);

AnalysisEngine ae = createEngine(aed,
  // Parameters
  MauiTopicExtractorAnnotator.PARAM_TEST_DIR(), "src/main/resources/data/term_assignment/test_fr",
  MauiTopicExtractorAnnotator.PARAM_FORMAT(), "skos",
  MauiTopicExtractorAnnotator.PARAM_LANGUAGE(), "fr",
  MauiTopicExtractorAnnotator.PARAM_NBOFTOPICS(), 10,
  MauiTopicExtractorAnnotator.PARAM_VOCABULARY(), "src/main/resources/data/vocabularies/agrovoc_fr.rdf.gz"
);

ae.process(ae.newJCas());
```

Despite the fact that the UIMA API is ugly as hell (even with uimaFit), using *uimaui* is very easy.
