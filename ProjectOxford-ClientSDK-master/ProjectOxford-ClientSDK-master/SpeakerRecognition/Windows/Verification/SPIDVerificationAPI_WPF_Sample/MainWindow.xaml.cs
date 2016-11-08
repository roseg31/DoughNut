﻿// 
// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license.
// 
// Microsoft Cognitive Services (formerly Project Oxford): https://www.microsoft.com/cognitive-services
// 
// Microsoft Cognitive Services (formerly Project Oxford) GitHub:
// https://github.com/Microsoft/ProjectOxford-ClientSDK
// 
// Copyright (c) Microsoft Corporation
// All rights reserved.
// 
// MIT License:
// Permission is hereby granted, free of charge, to any person obtaining
// a copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to
// permit persons to whom the Software is furnished to do so, subject to
// the following conditions:
// 
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED ""AS IS"", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
// LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
// OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
// WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
// 

using SampleUserControlLibrary;
using System.Windows;

namespace SPIDVerificationAPI_WPF_Sample
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        /// <summary>
        /// The filename that holds the speakerId
        /// </summary>
        public static readonly string SPEAKER_FILENAME = "SpeakerId";
        /// <summary>
        /// The name of the file that holds the speaker phrase
        /// </summary>
        public static readonly string SPEAKER_PHRASE_FILENAME = "SpeakerPhrase";
        /// <summary>
        /// The name of the file that holds the speaker enrollments
        /// </summary>
        public static readonly string SPEAKER_ENROLLMENTS = "Enrollments";
        /// <summary>
        /// Returns the subscription key of the Oxford API
        /// </summary>
        public string SubscriptionKey
        {
            get
            {
                return _scenariosControl.SubscriptionKey;
            }
        }
        /// <summary>
        /// Add user scenarios in the main window
        /// </summary>
        public MainWindow()
        {
            InitializeComponent();
            _scenariosControl.SampleTitle = "Speaker Verification Sample";
            _scenariosControl.Disclaimer = "Microsoft will receive the audio files you upload and may use them to improve Speaker Recognition API and related services. By submitting an audio, you confirm you have consent from everyone in it.";
            _scenariosControl.SampleScenarioList = new Scenario[]
            {
                new Scenario { Title = "Scenario 1: Make a new Enrollment", PageClass=typeof(EnrollPage)},
                new Scenario { Title = "Scenario 2: Verify a Speaker", PageClass=typeof(VerifySpeakerPage)}
            };
        }
        /// <summary>
        /// Logs a given message to the status bar
        /// </summary>
        /// <param name="s">The message to be logged</param>
        public void Log(string s)
        {
            _scenariosControl.Log(s);
        }
    }
}
